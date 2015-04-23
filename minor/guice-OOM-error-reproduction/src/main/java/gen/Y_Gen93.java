
  package gen;
  public class Y_Gen93 {
  		@com.google.inject.Inject
  		public Y_Gen93(Y_Gen94 y_gen94){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + y_gen94 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  