
  package gen;
  public class B_Gen43 {
  		@com.google.inject.Inject
  		public B_Gen43(B_Gen44 b_gen44){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen44 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  