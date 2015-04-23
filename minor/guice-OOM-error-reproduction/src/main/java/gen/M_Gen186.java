
  package gen;
  public class M_Gen186 {
  		@com.google.inject.Inject
  		public M_Gen186(M_Gen187 m_gen187){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen187 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  