
  package gen;
  public class B_Gen199 {
  		@com.google.inject.Inject
  		public B_Gen199(B_Gen200 b_gen200){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen200 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  