
  package gen;
  public class D_Gen162 {
  		@com.google.inject.Inject
  		public D_Gen162(D_Gen163 d_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  