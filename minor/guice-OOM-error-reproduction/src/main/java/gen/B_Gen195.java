
  package gen;
  public class B_Gen195 {
  		@com.google.inject.Inject
  		public B_Gen195(B_Gen196 b_gen196){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen196 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  