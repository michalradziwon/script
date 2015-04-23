
  package gen;
  public class D_Gen54 {
  		@com.google.inject.Inject
  		public D_Gen54(D_Gen55 d_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + d_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  