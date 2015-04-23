
  package gen;
  public class B_Gen16 {
  		@com.google.inject.Inject
  		public B_Gen16(B_Gen17 b_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  