
  package gen;
  public class B_Gen56 {
  		@com.google.inject.Inject
  		public B_Gen56(B_Gen57 b_gen57){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen57 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  