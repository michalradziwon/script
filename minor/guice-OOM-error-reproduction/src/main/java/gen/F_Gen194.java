
  package gen;
  public class F_Gen194 {
  		@com.google.inject.Inject
  		public F_Gen194(F_Gen195 f_gen195){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + f_gen195 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  