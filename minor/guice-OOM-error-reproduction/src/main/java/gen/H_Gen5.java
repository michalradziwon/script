
  package gen;
  public class H_Gen5 {
  		@com.google.inject.Inject
  		public H_Gen5(H_Gen6 h_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  