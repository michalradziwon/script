
  package gen;
  public class M_Gen192 {
  		@com.google.inject.Inject
  		public M_Gen192(M_Gen193 m_gen193){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen193 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  