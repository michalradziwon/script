
  package gen;
  public class B_Gen103 {
  		@com.google.inject.Inject
  		public B_Gen103(B_Gen104 b_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  