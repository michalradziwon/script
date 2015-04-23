
  package gen;
  public class Y_Gen94 {
  		@com.google.inject.Inject
  		public Y_Gen94(Y_Gen95 y_gen95){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen95 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  