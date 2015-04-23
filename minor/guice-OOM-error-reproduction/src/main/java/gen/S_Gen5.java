
  package gen;
  public class S_Gen5 {
  		@com.google.inject.Inject
  		public S_Gen5(S_Gen6 s_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  