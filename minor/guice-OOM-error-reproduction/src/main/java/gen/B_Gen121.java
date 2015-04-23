
  package gen;
  public class B_Gen121 {
  		@com.google.inject.Inject
  		public B_Gen121(B_Gen122 b_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  