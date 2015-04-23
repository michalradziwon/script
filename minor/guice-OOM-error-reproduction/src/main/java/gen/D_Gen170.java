
  package gen;
  public class D_Gen170 {
  		@com.google.inject.Inject
  		public D_Gen170(D_Gen171 d_gen171){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen171 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  