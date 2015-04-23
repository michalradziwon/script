
  package gen;
  public class B_Gen72 {
  		@com.google.inject.Inject
  		public B_Gen72(B_Gen73 b_gen73){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen73 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  