
  package gen;
  public class B_Gen197 {
  		@com.google.inject.Inject
  		public B_Gen197(B_Gen198 b_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  