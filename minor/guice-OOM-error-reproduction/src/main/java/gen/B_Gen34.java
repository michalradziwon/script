
  package gen;
  public class B_Gen34 {
  		@com.google.inject.Inject
  		public B_Gen34(B_Gen35 b_gen35){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen35 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  