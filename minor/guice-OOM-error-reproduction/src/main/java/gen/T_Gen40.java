
  package gen;
  public class T_Gen40 {
  		@com.google.inject.Inject
  		public T_Gen40(T_Gen41 t_gen41){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen41 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  