
  package gen;
  public class B_Gen161 {
  		@com.google.inject.Inject
  		public B_Gen161(B_Gen162 b_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  