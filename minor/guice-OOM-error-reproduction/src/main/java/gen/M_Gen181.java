
  package gen;
  public class M_Gen181 {
  		@com.google.inject.Inject
  		public M_Gen181(M_Gen182 m_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + m_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  