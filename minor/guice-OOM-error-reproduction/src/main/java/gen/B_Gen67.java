
  package gen;
  public class B_Gen67 {
  		@com.google.inject.Inject
  		public B_Gen67(B_Gen68 b_gen68){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen68 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  