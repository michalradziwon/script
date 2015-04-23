
  package gen;
  public class B_Gen35 {
  		@com.google.inject.Inject
  		public B_Gen35(B_Gen36 b_gen36){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen36 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  