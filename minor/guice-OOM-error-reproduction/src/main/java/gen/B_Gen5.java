
  package gen;
  public class B_Gen5 {
  		@com.google.inject.Inject
  		public B_Gen5(B_Gen6 b_gen6){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen6 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  