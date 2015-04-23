
  package gen;
  public class B_Gen117 {
  		@com.google.inject.Inject
  		public B_Gen117(B_Gen118 b_gen118){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen118 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  