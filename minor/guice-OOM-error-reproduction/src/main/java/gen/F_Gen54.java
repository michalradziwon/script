
  package gen;
  public class F_Gen54 {
  		@com.google.inject.Inject
  		public F_Gen54(F_Gen55 f_gen55){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen55 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  