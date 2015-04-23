
  package gen;
  public class B_Gen96 {
  		@com.google.inject.Inject
  		public B_Gen96(B_Gen97 b_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  