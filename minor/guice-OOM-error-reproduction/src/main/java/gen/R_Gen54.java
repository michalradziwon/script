
  package gen;
  public class R_Gen54 {
  		@com.google.inject.Inject
  		public R_Gen54(R_Gen55 r_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + r_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  