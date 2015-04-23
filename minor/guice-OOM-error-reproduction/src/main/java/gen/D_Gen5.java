
  package gen;
  public class D_Gen5 {
  		@com.google.inject.Inject
  		public D_Gen5(D_Gen6 d_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  