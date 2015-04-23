
  package gen;
  public class B_Gen85 {
  		@com.google.inject.Inject
  		public B_Gen85(B_Gen86 b_gen86){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen86 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  