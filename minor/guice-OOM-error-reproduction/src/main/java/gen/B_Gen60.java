
  package gen;
  public class B_Gen60 {
  		@com.google.inject.Inject
  		public B_Gen60(B_Gen61 b_gen61){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen61 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  