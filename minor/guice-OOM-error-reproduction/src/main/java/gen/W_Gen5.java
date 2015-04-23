
  package gen;
  public class W_Gen5 {
  		@com.google.inject.Inject
  		public W_Gen5(W_Gen6 w_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  