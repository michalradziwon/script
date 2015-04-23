
  package gen;
  public class B_Gen166 {
  		@com.google.inject.Inject
  		public B_Gen166(B_Gen167 b_gen167){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen167 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  