
  package gen;
  public class T_Gen186 {
  		@com.google.inject.Inject
  		public T_Gen186(T_Gen187 t_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + t_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  