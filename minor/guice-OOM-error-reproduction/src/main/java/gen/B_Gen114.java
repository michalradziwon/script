
  package gen;
  public class B_Gen114 {
  		@com.google.inject.Inject
  		public B_Gen114(B_Gen115 b_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  