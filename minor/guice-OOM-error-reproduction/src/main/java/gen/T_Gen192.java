
  package gen;
  public class T_Gen192 {
  		@com.google.inject.Inject
  		public T_Gen192(T_Gen193 t_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  