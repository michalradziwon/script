
  package gen;
  public class B_Gen196 {
  		@com.google.inject.Inject
  		public B_Gen196(B_Gen197 b_gen197){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen197 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  