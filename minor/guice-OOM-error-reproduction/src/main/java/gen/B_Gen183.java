
  package gen;
  public class B_Gen183 {
  		@com.google.inject.Inject
  		public B_Gen183(B_Gen184 b_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + b_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  