
  package gen;
  public class B_Gen81 {
  		@com.google.inject.Inject
  		public B_Gen81(B_Gen82 b_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  