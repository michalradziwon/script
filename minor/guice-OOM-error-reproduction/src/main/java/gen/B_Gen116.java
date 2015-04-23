
  package gen;
  public class B_Gen116 {
  		@com.google.inject.Inject
  		public B_Gen116(B_Gen117 b_gen117){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen117 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  