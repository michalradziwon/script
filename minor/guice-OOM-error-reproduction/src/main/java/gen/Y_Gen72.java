
  package gen;
  public class Y_Gen72 {
  		@com.google.inject.Inject
  		public Y_Gen72(Y_Gen73 y_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  