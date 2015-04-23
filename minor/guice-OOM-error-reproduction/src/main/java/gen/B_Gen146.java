
  package gen;
  public class B_Gen146 {
  		@com.google.inject.Inject
  		public B_Gen146(B_Gen147 b_gen147){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen147 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  