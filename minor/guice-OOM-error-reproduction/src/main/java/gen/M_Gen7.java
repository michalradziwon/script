
  package gen;
  public class M_Gen7 {
  		@com.google.inject.Inject
  		public M_Gen7(M_Gen8 m_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  