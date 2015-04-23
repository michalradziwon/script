
  package gen;
  public class Y_Gen91 {
  		@com.google.inject.Inject
  		public Y_Gen91(Y_Gen92 y_gen92){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen92 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  