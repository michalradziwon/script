
  package gen;
  public class T_Gen84 {
  		@com.google.inject.Inject
  		public T_Gen84(T_Gen85 t_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  