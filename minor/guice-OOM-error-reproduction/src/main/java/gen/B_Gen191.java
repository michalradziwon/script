
  package gen;
  public class B_Gen191 {
  		@com.google.inject.Inject
  		public B_Gen191(B_Gen192 b_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  