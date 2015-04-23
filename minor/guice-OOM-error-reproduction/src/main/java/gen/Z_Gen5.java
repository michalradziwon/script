
  package gen;
  public class Z_Gen5 {
  		@com.google.inject.Inject
  		public Z_Gen5(Z_Gen6 z_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + z_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  