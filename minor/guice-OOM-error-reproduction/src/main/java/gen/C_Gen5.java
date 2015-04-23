
  package gen;
  public class C_Gen5 {
  		@com.google.inject.Inject
  		public C_Gen5(C_Gen6 c_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + c_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  