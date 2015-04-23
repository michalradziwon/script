
  package gen;
  public class T_Gen188 {
  		@com.google.inject.Inject
  		public T_Gen188(T_Gen189 t_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  