
  package gen;
  public class B_Gen8 {
  		@com.google.inject.Inject
  		public B_Gen8(B_Gen9 b_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  