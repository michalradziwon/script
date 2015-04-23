
  package gen;
  public class B_Gen71 {
  		@com.google.inject.Inject
  		public B_Gen71(B_Gen72 b_gen72){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen72 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  