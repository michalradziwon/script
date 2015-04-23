
  package gen;
  public class L_Gen5 {
  		@com.google.inject.Inject
  		public L_Gen5(L_Gen6 l_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  