
  package gen;
  public class O_Gen5 {
  		@com.google.inject.Inject
  		public O_Gen5(O_Gen6 o_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  